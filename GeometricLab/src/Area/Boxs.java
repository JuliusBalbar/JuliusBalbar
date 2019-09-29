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
public class Boxs {
    public Boxs(){
        Box box1=new Box(0,0,0);
        box1.length=2;
        box1.width=3;
        box1.getHeight();
        
        System.out.println("Box a: " + box1.toString());
        System.out.println("Box a surface area: " + box1.getArea());
        
        Box box2=new Box(0,0,0);
        box2.length=4;
        box2.width=7;
        box2.getHeight();
        
        System.out.println("Box b: " + box2.toString());
        System.out.println("Box b surface area: " + box2.getArea());
        
        System.out.print("Check if the box a and box b are equal? ");
        if (box1.getArea()==box2.getArea()){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
