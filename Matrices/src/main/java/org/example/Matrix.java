package org.example;

import java.util.ArrayList;

public class Matrix {
        public ArrayList<ArrayList<Integer>>  myMatrix(){
            var myList = new ArrayList<ArrayList<Integer>>();
            int counter = 1;
            for(int i = 0; i <= 3; i++){
                var data = new ArrayList<Integer>();
                for (int j = 1; j <= 3; j++ ){
                    data.add(j);
                    counter++;
                }
                myList.add(data);
            }
            return myList;
        }
}
