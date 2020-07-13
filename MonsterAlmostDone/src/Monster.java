//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;
        private String s = " ";
	//write a default Constructor
        public Monster(){
        myHeight = 0;
        myWeight = 0;
        myAge = 0;
        }


	//write an initialization constructor with an int parameter ht
        public Monster(int ht){
        myHeight =ht;
        }


	//write an initialization constructor with int parameters ht and wt
        public Monster(int ht,int wt){
        myHeight =ht;
        myWeight = wt;
        }



	//write an initialization constructor with int parameters ht, wt, and age
        public Monster(int ht,int wt,int age){
        myHeight =ht;
        myWeight = wt;
        myAge = age;
        }


	//modifiers - write set methods for height, weight, and age

    public void setWeight(int myWeight) {
        this.myWeight = myWeight;
    }

    public void setHeight(int myHeight) {
        this.myHeight = myHeight;
    }

    public void setAge(int myAge) {
        this.myAge = myAge;
    }
        
        
        
	//accessors - write get methods for height, weight, and age
    public int getWeight() {
        return myWeight;
    }

    public int getHeight() {
        return myHeight;
    }

    public int getAge() {
        return myAge;
    }
	
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
            

		return false;
	}

	public int compareTo( Object obj )
	{
		//Monster rhs = (Monster)obj;
                Monster other = (Monster)obj;
                if(myHeight>other.myHeight)
                  return 1;
                else if(myHeight<other.myHeight) 
                  return -1;
                else if(myWeight>other.myWeight)
                    return 1;
                else if(myWeight<other.myWeight)
                    return -1;
                else if(myAge>other.myAge)
                    return 1;
                else if(myAge<other.myAge)
                    return -1;
                return 0;




		//return -1;
	}

	//write a toString() method
	public String toString(){
        return "" + myHeight+s+myWeight+s+myAge;
        }
	
}