class MinStack {
    int[] stack = new int[70000];
    int[] minstack = new int[50];
    int stop=-1,mtop=-1;
    
    public void push(int x) {
        
        if(stop==-1)
        {
          stack[++stop]=x;
          minstack[++mtop]=x;    
        }
        else
        {
            if(minstack[mtop]>=x)
               minstack[++mtop]=x;
            stack[++stop]=x; 
        }    
    }

    public void pop() {
    
        if(stop!=-1){
            
           if(minstack[mtop]==stack[stop])
           {
              mtop--;stop--;
           }
           else
           {
              stop--;
           }
        }
    }

    public int top() {
        return stack[stop];
    }

    public int getMin() {
        return minstack[mtop];
    }
}

