package com.example.trent.workshop;
/**
 * Created by Trent on 8/31/2016.
 * This class is for the calculations of the locations around the circle according the amount of
 * holes in the pattern
 */
public class Calculations {
    float[]xHole = new float[11];
    float[]yHole= new float[11];
    float[]angleLocation = new float[11];
 //================================Calculations  Constructor=========================================
    public Calculations(float circleDiameter, int numberOfHoles){
        //Declare Constants
        final int CIRCLE_DEGREES = 360;
        final int GET_RADIUS = 2;
        final float DEGREES_OF_CIRCLE = CIRCLE_DEGREES/numberOfHoles;


        int index = 0;

        float holeDegree=0;
        float radius;
        /*Setting Radius for hole and calculations need this number so i left it outside the loop so
        there would be redundant code.*/
        radius= circleDiameter/GET_RADIUS;

/* Formula for X sin(holeDegree)*radius
   Formula for y cos(holeDegree)*radius
 */
                if (holeDegree == 0){
                xHole[index]= 0;
                yHole[index] = radius;
                angleLocation[index]=holeDegree;
                index++;
                holeDegree = holeDegree+DEGREES_OF_CIRCLE;
                do{
                    xHole[index]=(float)Math.sin(Math.toRadians(holeDegree))*radius;
                    yHole[index]=(float)Math.cos(Math.toRadians(holeDegree))*radius;
                    angleLocation[index]=holeDegree;
                    holeDegree = holeDegree+DEGREES_OF_CIRCLE;
                    index++;
                }while (index<numberOfHoles);

            }//if statement
            else{
                do{
                    xHole[index]=(float)Math.sin(Math.toRadians(holeDegree))*radius;
                    yHole[index]=(float)Math.cos(Math.toRadians(holeDegree))*radius;
                    angleLocation[index]=holeDegree;
                    holeDegree = holeDegree+DEGREES_OF_CIRCLE;
                    index++;
                }while (index<numberOfHoles);
            }//else statement
    }
//=================================Setter methods===================================================
    public float getFirstXHole(){
        return xHole[0];
    }
    public float getFirstYHole(){
        return yHole[0];
    }
    public float getSecondXHole(){
        return xHole[1];
    }
    public float getSecondYHole(){
        return yHole[1];
    }
    public float getThirdXHole(){
        return xHole[2];
    }
    public float getThirdYHole(){
        return yHole[2];
    }
    public float getForthXHole(){
        return xHole[3];
    }
    public float getForthYHole(){
        return yHole[3];
    }
    public float getFifthXHole(){
        return xHole[4];
    }
    public float getFifthYHole(){
        return yHole[4];
    }
    public float getSixthXHole(){
        return xHole[5];
    }
    public float getSixthYHole(){
        return yHole[5];
    }
    public float getSeventhXHole(){
        return xHole[6];
    }
    public float getSeventhYHole(){
        return yHole[6];
    }
    public float getEighthXHole(){
        return xHole[7];
    }
    public float getEightYHole(){
        return yHole[7];
    }
    public float getNinthXHole(){
        return xHole[8];
    }
    public float getNinthYHole(){
        return yHole[8];
    }
    public float getTenthXHole(){
        return xHole[9];
    }
    public float getTenthYHole(){
        return yHole[9];
    }
    public float getEleventhXHole(){
        return xHole[10];
    }
    public float getEleventhYHole(){
        return yHole[10];
    }
//===========================end of setter methods==================================================


}
