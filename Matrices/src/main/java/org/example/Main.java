package org.example;

public class Main {

    public void
    Matrix matrix = new Matrix();

        for (int i = 0; i<matrix.myMatrix().size();i++){
        for(int j = 0; j < matrix.myMatrix().get(i).size(); j++){
            System.out.println(matrix.myMatrix().get(i).get(j));
        }
    }
}