
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schereja
 */
public class CalculateService {
    private double calculatedResult;
    
    /**
     * Calculate service constructor which takes the length and width and sends
     * private variables
     * 
     */
    public CalculateService(){
   
    }
    public HttpServletRequest getResultFromType(HttpServletRequest request, Shapes shape){
        switch(shape){
            case RECTANGLE:
                String stringLength = request.getParameter("length");
                String stringWidth = request.getParameter("width");
                double dblLength = 0;  
                double dblWidth = 0;
               
                dblLength = Double.valueOf(stringLength);
                dblWidth = Double.valueOf(stringWidth);
               
                calculatedResult = dblLength * dblWidth;
                request.setAttribute("shape", shape);
                request.setAttribute("result", calculatedResult);
                break;
            case CIRCLE:
                String sRadius = request.getParameter("radius");
                double dRadius = 0;
                
                dRadius = Double.valueOf(sRadius);
                
                calculatedResult = dRadius * Math.PI;
                request.setAttribute("shape", shape);
                request.setAttribute("result", calculatedResult);
                break;
            case TRIANGLE:
                String stringSideOne = request.getParameter("triangleSideOne");
                String stringSideTwo = request.getParameter("triangleSideTwo");
                String stringSideThree = request.getParameter("triangleSideThree");
                double sideOne = 0;
                double sideTwo = 0;
                double sideThree = 0;
                if(stringSideOne != null){
                    sideOne = Double.valueOf(stringSideOne);
                }
                if(stringSideTwo != null){
                    sideTwo = Double.valueOf(stringSideTwo);
                }
                if(stringSideThree != null){
                    sideThree = Double.valueOf(stringSideThree);
                }
                if(sideOne == 0){
                    calculatedResult = Math.sqrt((sideThree*sideThree)-(sideTwo*sideTwo));
                } else if(sideTwo == 0){
                    calculatedResult = Math.sqrt((sideThree*sideThree)-(sideOne*sideOne));
                } else if(sideThree == 0){
                    calculatedResult = Math.sqrt((sideOne*sideOne)+(sideTwo*sideTwo));
                }
                
                request.setAttribute("shape", shape);
                request.setAttribute("result", calculatedResult);
                break;
        }
        return request;
    }
    

    
    
}
