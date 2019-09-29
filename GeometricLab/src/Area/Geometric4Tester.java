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
public class Geometric4Tester {
   
      public Geometric4Tester(){
          IsoscelesRight isoC = new IsoscelesRight(3.0);
          
          isoC.sideA=3.0;
          isoC.equalSide=isoC.sideA;
          isoC.sideB=isoC.sideA;
          isoC.sideC=isoC.getNotEqualSide();
          System.out.println("IsoscelesRight c: " + isoC.toString());
          System.out.println("IsoscelesRight c area : " + isoC.getArea());
          
          IsoscelesRight isoD = new IsoscelesRight(3.0);
          
          isoD.sideA=3.0;
          isoD.equalSide=isoD.sideA;
          isoD.sideB=isoD.sideA;
          isoD.sideC=isoD.getNotEqualSide();
          System.out.println("IsoscelesRight d: " + isoD.toString());
          System.out.println("IsoscelesRight d area : " + isoD.getArea());
          
          System.out.print("Check if IsoscelesRight c and IsoscelesRightd are Equal? ");
          if(isoC.getArea()==isoD.getArea()){
              System.out.println("True");
          }
          else 
              System.out.println("False");
      }
}
