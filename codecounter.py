import os,sys

# file = 'C:/Users/wuzhiyong/IdeaProjects/RsvpBotServer/BotServiceServer/src/main/java/cn/rsvptech/rchat/dispatch/agents/huawei/sow/sow2/modulingroleplay/school'

args = sys.argv
if len(args) == 1:
    print('输入文件或者路径')
    exit(-1)
file = args[1]

def count_file(file:str):
    count_num = 0
    if file.endswith('java'):
        comment_flag = False
        for line in open(file,encoding='utf-8'):
            line = line.strip()
            if not line:
                continue
            if line.startswith('//'):
                continue
            else:
                if line.startswith('/*'):
                    comment_flag = True
                    continue
                if line.endswith('*/'):
                    comment_flag = False
                    continue
                if comment_flag:
                    continue
                count_num += 1
    return count_num

def count_dir(file:str):
    total = 0
    for root,dirs,files in os.walk(file):
        for name in files:
            each = os.path.join(root,name)
            count_num = count_file(each)
            total += count_num
    return total

def counter(file:str):
    if os.path.isfile(file):
        return count_file
    elif os.path.isdir(file):
        return count_dir

counter = counter(file)

def main():
    num = counter(file)
    print(num)


if __name__ == '__main__':
    main()

            