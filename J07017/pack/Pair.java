package javaapplication1.J07017.pack;
public  class Pair<first, second>{
        private first fir;
        private second sec;
        public Pair(first fir, second sec){
            this.fir=fir;
            this.sec=sec;
        }
        public boolean check(int a){
            for(int i=2; i<=Math.sqrt(a); i++){
                if(a%i==0) return false;
            }
            return true;
        }
        public boolean isPrime(){
            return check((Integer)fir) && check((Integer)sec);
        }
        @Override
        public String toString(){
            return String.format("%s %s", this.fir, this.sec);
        }
    }