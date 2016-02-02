/**
 *
 * Copyright 2016 RSVP Technologies Inc. All rights reserved.
 * MatrixBuilder.java
 *
 */
package Java.utils;

import java.io.IOException;
import java.util.*;

import com.alibaba.fastjson.JSON;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


/**
 * 从百度api获取地点距离和时间,转换为需要计算的矩阵模型
 *
 * @author He Tao (ht@nbicc.com)
 * @date 2016年1月26日
 */
public class MatrixBuilder {

	private final static String API_URL = "http://api.map.baidu.com/direction/v1/routematrix?output=json&origins=30.237381,120.15506%7C30.246149,120.108581%7C30.17639,120.103881&destinations=30.237381,120.15506%7C30.246149,120.108581%7C30.17639,120.103881&ak=YnlP2NAABxN3nAuVf1xZDGqj";
	private int[][] matrixs;// 最终生成的矩阵
	private int[][] rightMat;// 右边的小矩阵
	private int[][] bottomMat;// 底部的小矩阵
	private int[][] littleMat;// 右下方的小矩阵
	private double[][] points;// 保存需要规划的各个点集合
	private final int SINGLE_TYPE = 0;// 单一类型,不需要合并矩阵
	private final int MULTI_TYPE = 1;// 多点类型,需要合并矩阵

	public MatrixBuilder(double[][] points) {
		this.points = points;
	}

	private int getPlaningType() {
		return points.length > 5 ? MULTI_TYPE : SINGLE_TYPE;
	}

	private List<String> getJsonFromUrl() {
		HttpHelper httpHelper = new HttpHelper();
		List<String> jsonList = new ArrayList<>();
		int type = getPlaningType();
		if (type == SINGLE_TYPE) {
			if (httpHelper.getSingleHelper(points) != null) {
				jsonList.add(httpHelper.getSingleHelper(points));
			}

		} else if (type == MULTI_TYPE) {

		}
		return jsonList;

	}

	/**
	 * 解析节点,返回生成矩阵所需要的list形式
	 *
	 * @param json
	 * @return List<ElementsItem> 包含value信息的list
	 */
	private List<ElementsItem> parseEles(String json) {
		RouteInfo routeInfo = JSON.parseObject(json, RouteInfo.class);
		Result result = JSON.parseObject(routeInfo.getResult(), Result.class);
		if (result == null) {
			return null;
		}
		return result.getElements();
	}

	/**
	 * 返回一个矩阵 形式为N*M
	 *
	 * @param json
	 *            待解析的json字符串
	 * @param st
	 *            起点的数量
	 * @param ed
	 *            终点的数量
	 * @return 二维矩阵
	 */
	public int[][] getDuraMatrixs(String json, int st, int ed) {
		List<ElementsItem> eleInfos = parseEles(json);
		if (eleInfos.size() > 0 && eleInfos != null) {
			matrixs = new int[st][ed];
			int num = 0;
			// 生成N阶矩阵
			for (int i = 0; i < st; i++) {
				for (int j = 0; j < ed; j++) {
					if (i == j) {
						matrixs[i][j] = 0;
					} else {
						matrixs[i][j] = eleInfos.get(num).getDuration().getValue();
					}
					num++;
				}
			}
		}
		return matrixs;
	}


	/**
	 * 返回一个矩阵 形式为N*M
	 *
	 * @param json
	 *            待解析的json字符串
	 * @param st
	 *            起点的数量
	 * @param ed
	 *            终点的数量
	 * @return 二维矩阵
	 */
	public int[][] getDistanceMatrixs(String json, int st, int ed) {
		List<ElementsItem> eleInfos = parseEles(json);
		if (eleInfos.size() > 0 && eleInfos != null) {
			matrixs = new int[st][ed];
			int num = 0;
			// 生成N阶矩阵
			for (int i = 0; i < st; i++) {
				for (int j = 0; j < ed; j++) {
					if (i == j) {
						matrixs[i][j] = 0;
					} else {
						matrixs[i][j] = eleInfos.get(num).getDistance().getValue();
					}
					num++;
				}
			}
		}
		return matrixs;
	}

	/**
	 * 返回生成的N阶矩阵 形式为N*N
	 *
	 * @param json
	 * @return
	 */
	public HashMap<String ,Integer[][]> getSquareMatrixs() {
		HashMap<String,Integer[][]> map = new HashMap<>();
		Integer[][] matrixs1;
		Integer[][] matrixs2;
		List<String> jsonList = getJsonFromUrl();
		List<ElementsItem> eleInfos = null;
		if (jsonList.size() == 1) {
			eleInfos = parseEles(jsonList.get(0));
		}
		if (eleInfos.size() > 0 && eleInfos != null) {
			int eleSize = (int) Math.sqrt(eleInfos.size());
			matrixs1 = new Integer[eleSize][eleSize];
			matrixs2 = new Integer[eleSize][eleSize];
			int num = 0;
			// 生成N阶矩阵
			for (int i = 0; i < eleSize; i++) {
				for (int j = 0; j < eleSize; j++) {
					if (i == j) {
						matrixs1[i][j] = 0;
						matrixs2[i][j] = 0;
					} else {
						matrixs1[i][j] = eleInfos.get(num).getDuration().getValue();
						matrixs2[i][j] = eleInfos.get(num).getDistance().getValue();
					}
					num++;
				}
			}
			map.put("duration",matrixs1);
			map.put("distance",matrixs2);
		}
		return map;
	}

	// 二维数组纵向合并
	private static String[][] unite(String[][] content1, String[][] content2) {
		String[][] newArrey = new String[][] {};
		List<String[]> list = new ArrayList<String[]>();
		list.addAll(Arrays.<String[]> asList(content1));
		list.addAll(Arrays.<String[]> asList(content2));
		return list.toArray(newArrey);
	}

	// 二维数组横向合并
	private static String[][] getMergeArray(String[][] al, String[][] bl) {
		if (al == null || al.length == 0)
			return bl;
		if (bl == null || bl.length == 0)
			return al;
		String[][] newArrey = null;
		// 根据数组的长度，判断要补全哪个数组
		if (al.length > bl.length) {
			newArrey = new String[al.length][];
			// 补全较短的数组
			String[][] temps = new String[al.length - bl.length][bl[0].length];
			for (int i = 0; i < temps.length; i++) {
				for (int j = 0; j < temps[0].length; j++)
					temps[i][j] = "";
			}
			String[][] btemp = unite(bl, temps);
			// 合并
			for (int k = 0; k < al.length; k++) {
				newArrey[k] = getMergeArray(al[k], btemp[k]);
			}
		} else {
			newArrey = new String[bl.length][];
			String[][] temps = new String[bl.length - al.length][al[0].length];
			for (int i = 0; i < temps.length; i++) {
				for (int j = 0; j < temps[0].length; j++)
					temps[i][j] = "";
			}
			String[][] atemp = unite(al, temps);
			for (int k = 0; k < bl.length; k++) {
				newArrey[k] = getMergeArray(atemp[k], bl[k]);
			}
		}
		return newArrey;
	}

	// 一维数组合并
	private static String[] getMergeArray(String[] al, String[] bl) {
		String[] a = al;
		String[] b = bl;
		String[] c = new String[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}

	public static HashMap<String, Integer[][]> generateMatrix(double[][] matrix){
		MatrixBuilder builder = new MatrixBuilder(matrix);
		return builder.getSquareMatrixs();
	}



}

class HttpHelper {

    private final String URL="http://api.map.baidu.com/direction/v1/routematrix?output=json&origins=";

    /**
     * 解析5个点以下的url
     * @param points
     * @return
     */
    public String getSingleHelper(double[][] points){
        if(points.length<=5){
            String url=concateUrl(URL, points);
            return getHelper(url);
        }
        return null;
    }

    private String  concateUrl(String url,double[][] points){
        StringBuilder sb_st=new StringBuilder(url);
        StringBuilder sb_ed=new StringBuilder("&destinations=");
        int num=points.length;
        for(int i=0;i<num;i++){
            sb_st.append(points[i][0]+","+points[i][1]+"%7C");
            sb_ed.append(points[i][0]+","+points[i][1]+"%7C");
        }
        String st=sb_st.substring(0, sb_st.length()-3);
        String ed=sb_ed.substring(0,sb_ed.length()-3);
        //sb_ed.append("&ak=YnlP2NAABxN3nAuVf1xZDGqj");
        String urls=st+ed+"&ak=YnlP2NAABxN3nAuVf1xZDGqj";
        return urls;

    }

    public String getHelper(String httpUrl){
        // HttpGet连接对象
        HttpGet httpRequest=new HttpGet(httpUrl);
        String strResult="";
        try {
            //取得HttpClient对象
            HttpClient httpclient=new DefaultHttpClient();
            //请求HttpCLient，取得HttpResponse
            HttpResponse httpResponse=httpclient.execute(httpRequest);
            //请求成功
            if(httpResponse.getStatusLine().getStatusCode()==HttpStatus.SC_OK)
            {
                //取得返回的字符串
                strResult=EntityUtils.toString(httpResponse.getEntity());
                return strResult.trim();
            }else
            {
                return "请求错误";
            }
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch(Exception e)
        {
            e.getMessage().toString();
        }
		long time = System.currentTimeMillis();

		return strResult;
    }


//	public String
}

class Result {
	public List<ElementsItem> elements;

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public List<ElementsItem> getElements() {
		return elements;
	}

	public void setElements(List<ElementsItem> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "Result [elements=" + elements + "]";
	}

}


class ElementsItem {
	public Distance distance;
	public Duration duration;

	public ElementsItem() {
		// TODO Auto-generated constructor stub
	}

	public Distance getDistance() {
		return distance;
	}

	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ElementsItem [distance=" + distance + ", duration=" + duration + "]";
	}

}


class RouteInfo {

	private String result;

	public RouteInfo() {
		// TODO Auto-generated constructor stub
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "RouteInfo [result=" + result + "]";
	}

}





class Distance {
	public String text;
	public int value;

	public Distance() {
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Distance [text=" + text + ", value=" + value + "]";
	}

}

class Duration {
	public String text;
	public int value;

	public Duration() {
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Duration [text=" + text + ", value=" + value + "]";
	}

}




class Test{
	public static void main(String[] args) {
		HashMap<String ,Integer[][]> s = MatrixBuilder.generateMatrix(new double[][]{ { 30.237381, 120.14214 }, { 30.237481, 120.15510 }, { 30.237963, 120.14306 },
				{ 30.236481, 120.17406 }, { 30.237381, 120.15476 } });

		for (String key: s.keySet()
			 ) {
			System.out.println(key);
			for (int i = 0; i < s.get(key).length; i++) {
				for (int j = 0; j < s.get(key).length; j++) {
					System.out.print(s.get(key)[i][j] + " ");
				}
				System.out.println();
			}

		}
	}
}