/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

/**
 *
 * @author Julius Balbar
 */
public class Box extends Rectangle2{
    
        private int height=4;
        
        private double area;

        public Box (int l, int w, int h) {
         
        }
       

        public int getHeight(){
            return height;
        }

        public double getArea(){
            area = (2* length * height) + (2* length * width) +(2* width * height);
            return area;
        }

        public void equals(){
            
        }

        public String toString(){
            return "[Box: width = " + width + " length =" + length + " height =" + height + "]";
        }
}
