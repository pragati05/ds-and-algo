package ds.arrays;

import java.util.ArrayList;
import java.util.List;

class PlatformCount {

    List<Double> platform = new ArrayList<Double>();
    boolean isPlatformAvailable = false;

    int findPlatform(double arr[] , double dept[]){
        for(int i = 0 ; i< arr.length; i++){
            if(platform.isEmpty()){
                platform.add(dept[i]);

            }else{
            	 System.out.println("New Platform till Pass : " + i + " ~ "+ platform);
            	 
                for(int j = 0 ; j<platform.size(); j++) {
                    boolean b =  arr[i] > platform.get(j);
                    System.out.println(arr[i] + "> " +  platform.get(j) + ":" + b);
                    if(arr[i] > platform.get(j)){
                    	int index = platform.indexOf(platform.get(j));
                    	System.out.println("Update dept time from Index: " + index);
                        isPlatformAvailable = true;
                        platform.set(index,dept[i]);
                        break;
                       
                    }else {
                    	 isPlatformAvailable = false;
                    }
                }

              //  System.out.println("\n\n");
                System.out.println("isPlatformAvailable: " +isPlatformAvailable);
                if(!isPlatformAvailable){
                    platform.add(dept[i]);
                    isPlatformAvailable = true;
                }
                
                System.out.println("\n\n");
            }
        }
        return platform.size();
    }
  public static void main(String[] args) {
    double[] arr =  new double[] {9.00, 9.40, 9.50, 11.00, 15.00, 18.00} ; 
    double[] dep = new double[] {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};  
    PlatformCount s = new PlatformCount();
   int platformCount =  s.findPlatform(arr,dep);
   System.out.println("Platform: "+ platformCount);
   

    }

  }