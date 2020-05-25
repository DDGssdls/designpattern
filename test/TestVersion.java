package cn.edu.designpattern.test;

/**
 * @Author: DDG
 * @Date: 2020/4/23 10:21
 * @Description:
 */
public class TestVersion {

    public static void main(String[] args) {
        int i = TestVersion.compareVersion("2.2.2.0", "2.2.2.1");
        System.out.println(i);
    }

    public static int compareVersion(String version1, String version2){
        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");

        for (int i = 0, j = 0; i < version1Array.length || j < version2Array.length; i++, j++) {
            int i1 = i < version1Array.length ? Integer.parseInt(version1Array[i]): 0;
            int i2 = j < version2Array.length ?Integer.parseInt(version2Array[j]) : 0;
            if (i1> i2 ){
                return 1;
            }
            if (i1 < i2){
                return -1;
            }

        }

        return 0;
    }
}
