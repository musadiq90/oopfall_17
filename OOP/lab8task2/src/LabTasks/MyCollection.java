package LabTasks;

import java.util.*;


    public class MyCollection {


        public static <T> T max(List<T> lst, Comparator<T> comparator){

            if(lst.isEmpty())

                return null;

            List<T> templst = lst;

            Collections.sort(templst,comparator);

            return lst.get(lst.size()-1);
        }



        public static <T> T min(List<T> lst,Comparator<T> comparator){

            if(lst.isEmpty())

                return null;

            List<T> templst = lst;

            Collections.sort(templst,comparator);

            return lst.get(0);

        }


        public static <T> T sum(List<T> lst, Summer<T> summer){
            if(lst.isEmpty())
                return null;
            else{
                return (T) summer.sum(lst);
            }
        }


        public static <T> T sum(List<T> lst){
            if(lst.isEmpty())
                return null;
            if(lst.get(0) instanceof String) {
                String sum = "";
                for(int i = 0 ; i <lst.size();i++)
                    sum+=(String)lst.get(i);
                return (T) sum;
            }
            else if(lst.get(0) instanceof Integer) {
                Integer sum = 0;
                for(int i=0;i<lst.size();i++)
                    sum+=(Integer)lst.get(i);
                return (T) sum;
            }
            else if(lst.get(0) instanceof Double){
                Double sum = 0.0;
                for(int i=0 ; i<lst.size();i++)
                    sum+=(Double)lst.get(i);
                return (T) sum;
            }

            return null;
        }
}