class PrimeNumber {
        public boolean isPrime(int num){
                if(num < 2){
                        return false;
                }
                for(int i=2;i<num;i++){
                        if(num%i==0){
                                return false;
                        }
                }
                return true;
        }
}