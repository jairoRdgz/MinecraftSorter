package model;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

//import java.util.Hashtable;

public class MineHash {
	
	public  static void main(String[]args) {
		Blocks one = new Blocks(1, 5);
		Blocks two = new Blocks(1, 5);
		Blocks three = new Blocks(1, 5);
		Blocks four = new Blocks(2, 5);
		Blocks five = new Blocks(2, 5);
		Blocks six = new Blocks(3, 5);
		Blocks seven = new Blocks(3, 5);
		Blocks egith = new Blocks(3, 5);
		Blocks nine = new Blocks(3, 5);

		MineHash f = new MineHash();
		f.addBlock(one);
		f.addBlock(two);
		f.addBlock(three);
		f.addBlock(four);
		f.addBlock(five);
		f.addBlock(six);
		f.addBlock(seven);
		f.addBlock(egith);
		f.addBlock(nine);
		for(int i = 1; i< 8 ;i++) {
			Blocks generic = new Blocks(3+i, 5);
			f.addBlock(generic);
		}
		Blocks lol = new Blocks(5, 5);
		f.addBlock(lol);
		//one.addBlocks(two);
//		f.show();
//		System.out.println(one.getQuantify());
//		System.out.println(f.getInventory().get(0).peek().getQuantify());
//		f.show();
		for (int i = 0; i < 9; i++){
			Blocks temp = f.getInventory().get(0).poll();
			System.out.println(temp.getTag());
			System.out.println(temp.getQuantify());
			f.getInventory().get(0).add(temp);
		}
		//System.out.println(f.getInventory().get(0).peek().getTag());
	}
	private Hashtable<Integer, Queue<Blocks>> inventory;

	public MineHash(){
		init();
	}
	public void init(){
		inventory = new Hashtable<Integer,Queue<Blocks>>();
		Queue<Blocks> queue0 = new LinkedList<Blocks>();
		Queue<Blocks> queue1 = new LinkedList<Blocks>();
		Queue<Blocks> queue2 = new LinkedList<Blocks>();
		Queue<Blocks> queue3 = new LinkedList<Blocks>();
		inventory.put(0, queue0);
		inventory.put(1, queue1);
		inventory.put(2, queue2);
		inventory.put(3, queue3);
	}
	public void addBlock(Blocks block){
		boolean add = false;
		boolean flag ;
		Blocks temp ;
		for (int i = 0; i <= 3 && add == false; i++) {
			flag = false;
			System.out.println("HASH");
			for (int j = 0; j <= 8 && flag == false;j++){
				System.out.println("QUEUE");
				System.out.println("size:"+inventory.get(0).size());
				System.out.println("tag:"+block.getTag());
				System.out.println("quantify:"+block.getQuantify());
				System.out.println("time:"+j);
				if(inventory.get(i).size() == 0) {
					inventory.get(i).add(block);
					flag = true;
					add = true;
					//System.out.println("f");
				}else if(inventory.get(i).peek().getTag()==block.getTag()){
					if(inventory.get(i).peek().getQuantify()<64){
						inventory.get(i).peek().addBlocks(block);
						if(block.getQuantify()==0) {
							flag= true;
							add = true;
							System.out.println("entry for 0");

						}else {
//							flag = true;
							temp =  inventory.get(i).poll();
							inventory.get(i).add(temp);
						}
					}					
				}else if(j>inventory.get(i).size()){
					inventory.get(i).add(block);
					flag = true;
					add = true;
				}
//				else if(inventory.get(i).peek().getTag()!=block.getTag()){
//					inventory.get(i).add(block);
//					flag = true;
//					add = true;
//					System.out.println("entry");
//
//				}
				else{
					temp =  inventory.get(i).poll();
					inventory.get(i).add(temp);
//					System.out.println("entry");

				}
			}
		}
	}
	public LinkedList<Blocks> quickAcces(Blocks block){
		LinkedList<Blocks> retu = new LinkedList<Blocks>();
		
		return retu;
	}
	
	public void show(){
		Blocks temp;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 8 ;j++){
				System.out.println(inventory.get(i).peek().getQuantify());
				temp = inventory.get(i).poll();
				inventory.get(i).add(temp);
			}
			
		}
		
	}
	public Hashtable<Integer, Queue<Blocks>> getInventory() {
		return inventory;
	}
	public void setInventory(Hashtable<Integer, Queue<Blocks>> inventory) {
		this.inventory = inventory;
	}
	
}
