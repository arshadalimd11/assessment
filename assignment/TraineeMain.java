package assignment;

import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;

public class TraineeMain {
	
		Map<Integer,Trainee> map=new HashMap<>();
		Set<CsTrainee>csset=new HashSet<>();
		Set<EceTrainee> eceset=new HashSet<>();
		
		
		public static void main(String args[]) {
			TraineeMain demo=new TraineeMain();
			demo.runapp();
			
		}
		
		public void runapp() {
			Trainee t1=new CsTrainee(1,"Arshad","java");
			map.put(t1.getid(),t1);
			Trainee t2=new CsTrainee(2,"yusuf","C");
			map.put(t2.getid(),t2);
			Trainee t3=new EceTrainee(3,"faiz","diode");
			map.put(t3.getid(),t3);
			Trainee t4=new EceTrainee(4,"suhail","multimeter");
			map.put(t4.getid(),t4);
			
			for(Trainee trainee:map.values()) {
				Trainee traine = (Trainee) trainee;
				
				boolean iscse=traine instanceof CsTrainee;
				
				if(iscse) {
					csset.add((CsTrainee) traine);
					
				}
				else {
					eceset.add((EceTrainee)traine);
				}
				
			}
			System.out.println("CS Trainees");
			for(CsTrainee csset:csset) {
				
				int id=csset.getid();
				String language=csset.getLang();
				String name=csset.getname();
				System.out.println("name is " +name+ " id is " +id+ " language is "+language);
				
			}
			System.out.println("ECE trainee");
			for(EceTrainee eceset:eceset) {
				int id =eceset.getid();
				String name =eceset.getname();
				String device =eceset.getdevice();
				System.out.println("name is " +name+ " id is " +id+ " device is "+device);
				
			}
			
			
		}
}
