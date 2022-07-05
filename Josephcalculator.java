import java.lang.Math;
public class Josephcalculator{
	public static void main(String[]args){
		//JIANGHAN-JOSEPH developed
		//binomialcdf(successchance);
		//binomialchances(10,0.8,2);
		//binomialsd(n,p);

		//sampling distribution{
			//
		//}
			confidenceinterval(1, 0.3, 0.4, 10);
		//confidenceinterval(z*,p^,p,n)

		//zscore(xba,miu,sd);
		//combination(n,r);
		//permutation(n,r);
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
	public static double binomialcdf(double successchance){
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
	public static double binomialsd(int n,double p){
		double result=Math.sqrt(n*p*(1-p));
		System.out.println("sd="+result);
		return result;
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
			return -1;
		}
	}
	public static int permutation(double n,double r){
		if(n>r){
			int nloop=1;
			int rloop=1;
			int nrloop=1;
			for(int i=(int)n; i>1; i--){
				nloop*=i;
			}
			for(int ii=(int)(n-r); ii>1; ii--){
				nrloop*=ii;
			}
			int ncr=nloop/nrloop;
			return ncr;
		}
		else{
			return -1;
		}
	}
	public static double confidenceinterval(double znode,double phat,double p,double n){
		if(n!=0&&p<=1){
		double upper = phat + znode*Math.sqrt(n*p*(1-p)/n);
		double lower = phat - znode*Math.sqrt(n*p*(1-p)/n);
		System.out.println("("+lower+","+upper+")");
		return upper;
		}
		else
		return 0;
	}
}
