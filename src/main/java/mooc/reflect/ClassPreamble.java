package mooc.reflect;

/**
 * Created by wuzhiyong on 2016/5/4
 */
public @interface ClassPreamble {
    String author();
    String date();
    int currentVersion() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}
