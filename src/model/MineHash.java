package model;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class MineHash {
	
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
			for (int j = 0; j <= 8 && flag == false;j++){
				if(inventory.get(i).size() == 0) {
					inventory.get(i).add(block);
					flag = true;
					add = true;
				}else if(inventory.get(i).peek().getTag()==block.getTag()){
					if(inventory.get(i).peek().getQuantify()<64){
						inventory.get(i).peek().addBlocks(block);
						if(block.getQuantify()==0){
							flag= true;
							add = true;
						}else {
							inventory.get(i).add(block);
							flag= true;
						}
					}					
				}else if(j>inventory.get(i).size()){
					inventory.get(i).add(block);
					flag = true;
					add = true;
					System.out.println();
				}
				else{
					temp =  inventory.get(i).poll();
					inventory.get(i).add(temp);
				}
			}
		}
	}
	public LinkedList<Blocks> quickAcces(Blocks block){
		LinkedList<Blocks> retu = new LinkedList<Blocks>();
		
		return retu;
	}
	public Hashtable<Integer, Queue<Blocks>> getInventory() {
		return inventory;
	}
	public void setInventory(Hashtable<Integer, Queue<Blocks>> inventory) {
		this.inventory = inventory;
	}
	
}
