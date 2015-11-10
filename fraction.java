public class fraction {
    int n, d;
	fraction(int num, int del)
	{
		n = num;
		d = del;
	}
	
    public String toString()  //вывод
    {
    	return  n + "/" + d;
    }
    
    public fraction mul(fraction q)  //умножение
    {
        fraction s = new fraction (n * q.n, d * q.d);
        s.Simplify();
        return s;
    }
    
     public fraction div(fraction q)  //деление
    {
        fraction s = new fraction (n * q.d, d * q.n);
        s.Simplify();
        return s;
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
    	a.Simplify();
    	return a;
    }
    
    public fraction sub(fraction q)  //вычитание
    {
    	int nn = q.n;
        int dd = q.d;
    	n = n * dd;
        nn = nn * d;
        d = d * dd;
        n = n - nn;
    	fraction a = new fraction(n,d);
    	a.Simplify();
    	return a;
    }
    
    public boolean cam(fraction q)   //сравнение(больше или нет)
    {
        if ((double) n / d > (double) q.n / q.d)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean equal(fraction q)  //сравнение(равны или не равны)
    {
        if ((double) n / d == (double) q.n / q.d)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void Simplify()  //упрощение
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
