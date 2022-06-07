import java.lang.Math;
public class Josephcalculator{
	public static void main(String[]args){
		//JIANGHAN-JOSEPH developed
		//binomialchances(10,0.8,2);
		//zscore(xba,miu,sd);
		//binomialexpectedsuccessdtime(successchance);
		//combination(n,r);
	}
	public static double zscore(double xba, double miu, double sd){
		double result=(xba-miu)/sd;
		System.out.print("xba=");
		System.out.println(xba);
		System.out.print("miu=");
		System.out.println(miu);
		System.out.print("s.d.=");
		System.out.println(sd);
		System.out.print("z-score=");
		System.out.println(result);
		return result;
	}
	public static double binomialexpectedsuccessedtime(double successchance){
		if (successchance<=1){
			double result=1/successchance;
			System.out.println("expected to be success on "+result+" times");
			return result;
		}
		else{
			System.out.println("successchance must less or equal than 1");
			return 0;
		}
	}
	public static double binomialchances(double times, double successchance, double successtimes){
		if(times%1==0&&successtimes%1==0){
			double result=combination(times,successtimes)*Math.pow(successchance,successtimes)*Math.pow((1-successchance),(times-successtimes));
			System.out.println(result);
			return result;
		}
		else{
			System.out.println("please enter in integer times and successtimes");
			return 0;
		}
	}
	public static int combination(double n,double r){
		if(n>r){
			int nloop=1;
			int rloop=1;
			int nrloop=1;
			for(int i=(int)n; i>1; i--){
				nloop*=i;
			}
			for(int q=(int)r; q>1; q--){
				 rloop*=q;
			}
			for(int ii=(int)(n-r); ii>1; ii--){
				nrloop*=ii;
			}
			int ncr=nloop/(rloop*nrloop);
			return ncr;
		}
		if(n==r){
			return 1;
		}
		else{
			System.out.println("false");
			return 0;
		}
	}
}
