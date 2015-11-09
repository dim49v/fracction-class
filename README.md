# fracction-class
public class fraction {
  int n, d;
	fraction(int num, int del)
	{
		n = num;
		d = del;
	}
	
    public String toString() //вывод в консоль
    {
    	return  n + "/" + d;
    }
    
    public fraction divide(fraction q)  //деление
    {
        fraction s = new fraction (n * q.d, d * q.n);
        s.simplify();
        return s;
    }
    
    public fraction mul(fraction q)  //умножение
    {
        fraction s = new fraction (n * q.n, d * q.d);
        s.simplify();
        return s;
    }
    public boolean more(fraction q)  //сравнение (больше или меньше)
    {
    	boolean g;
    	if ((double) n / d > (double) q.n / q.d)
    	{
    		g = true;
    	}
    	else
    	{
    		g = false;
    	}
    	return g;
    }
    
    public boolean equal(fraction q)  //сравнение (равно или не равно)
    {
    	boolean g;
    	if ((double) n / d == (double) q.n / q.d)
    	{
    		g = true;
    	}
    	else
    	{
    		g = false;
    	}
    	return g;
    }
    public fraction add(fraction q)  //сложение
    {
    	int nn = q.n;
		int dd = q.d;
    	n = n * dd;
        nn = nn * d;
        d = d * dd;
        n = n + nn;
    	fraction a = new fraction(n,d);
    	a.simplify();
    	return a;
    
    }
    
    public fraction subtract(fraction q)  //вычитание
    {
    	int nn = q.n;
		int dd = q.d;
    	n = n * dd;
        nn = nn * d;
        d = d * dd;
        n = n - nn;
    	fraction a = new fraction(n,d);
    	a.simplify();
    	return a;
    
    }
    public void simplify()  //упрощение
    {
    	int p1 = Math.abs(n);
    	int p2 = Math.abs(d);
    	if (p1!=0)
    	{
        	while (p1!=p2)
        	{
        		if (p1>p2)
        		{
        			p1 = p1 - p2;
        		}
        		else
        		{
        			p2 = p2 - p1;
        		}
        	}
    	}
    	else
    	{
    		p1=d;
    	}
    	n = n / p1;
        d = d / p1;
      }
	
}
