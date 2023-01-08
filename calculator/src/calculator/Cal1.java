//電卓

package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cal1 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;
		
		System.out.print("値を入力→");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println("\n------------------------------------------------------------------");
		
		int[] N = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("数値を入力→");
			str = br.readLine();
			int num2 = Integer.parseInt(str);
			N[i] = num2;
		}
		
		System.out.println("\n------------------------------------------------------------------");
		
		
		for(int k = 0; k < num-1; k++) {
			
			if(k == 0) {
				System.out.print("演算子を入力：");
				String ope = br.readLine();
				
				if (ope.equals("*")){
					
				      total = N[k] * N[k+1];
				      System.out.println("計算過程は" + N[k] + "*" + N[k+1] + "=" + total);
				      
				    }else if (ope.equals("+")){
				    	
				      total = N[k] + N[k+1];
				      System.out.println("計算過程は" + N[k] + "+" + N[k+1] + "=" + total);
				      
				    }else if (ope.equals("-")){
				    	
				    	total = N[k] - N[k+1];
				    	System.out.println("計算過程は" + N[k] + "-" + N[k+1] + "=" + total);
				    	
				    }else{
				    	
				      if (N[k+1] == 0){
				        System.out.println("0 で割ろうとしました");
				        
				      }

				      total = N[k] / N[k+1];
				      System.out.println("計算過程は" + N[k] + "/" + N[k+1] + "=" + total);
				    }
			}else {
				
				System.out.print("演算子を入力：");
				String ope2 = br.readLine();
				
				
				if (ope2.equals("*")){
					System.out.print("計算過程は" + total + "*" + N[k+1] + "=" );
				      	total = total * N[k+1];
				      	System.out.println(total);
				      
				    }else if (ope2.equals("+")){
				    	System.out.print("計算過程は" + total + "+" + N[k+1] + "=" );
				    		total = total + N[k+1];
				    		System.out.println(total);
				      
				    }else if (ope2.equals("-")){
				    	System.out.print("計算過程は" + total + "-" + N[k+1] + "=" );
				    	 	total = total - N[k+1];
				    	 	System.out.println(total);
				    	
				    }else{
				      if (N[k+1] == 0){
				        System.out.println("0 で割ろうとしました");
				      }

				      	System.out.print("計算過程は" + total + "/" + N[k+1] + "=" );
				      		total = total / N[k+1];
				      		System.out.println(total);
				      
				    }
			}
			
		}
		
		System.out.println("\n------------------------------------------------------------------");
		
		System.out.println("計算結果は " + total + " です");
	}

}

