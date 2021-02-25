package com.educacionit.clase13;
//
//https://www.oracle.com/technical-resources/articles/java/ma14-java-se-8-streams.html
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoJavaSiete {

	public static void main(String[] args) {
		List<Trasaction> transactions = new ArrayList<>();
		
		List<Trasaction> groceryTrasactions = new ArrayList<>();
		
		for(Trasaction t : transactions) {
			if(t.getType() == Transaction.GROCERY) {
				groceryTrasactions.add(t);
			}
		}

	
		Collections.sort(groceryTrasactions , new Comparator() {
			
			public int compare(Object t1 ,Object t2) {
				
				Trasaction tt1 =  (Trasaction) t1;
				Trasaction tt2 =  (Trasaction) t2;
				return tt2.getValue().compareTo(tt1.getValue());
			}		
			
		});
		
		
		List<Integer> transactionIds = new ArrayList<Integer>() ;
		
			for (Trasaction transaccion : groceryTrasactions) {
				transactionIds.add(transaccion.getId());
			}
		
		//ahora veamos como seria con un Stream en JAVA 8
List<Integer> IdDeLasTransaccioneGroseras = transactions.parallelStream().
 						filter( t -> t.getType() == Transaction.GROCERY )
 						.sorted(comparing(Transaction::getValue).reversed())
 						.map(Transaction::getId)
 						.collect(toList());		
			
		
		
	}

	private static Comparator comparing(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
