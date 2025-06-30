class Solution {
    public int solution(int n, int k) {
        int lambPrice = 12000;
        int drinkPrice = 2000;

        int freeDrinks = n / 10;       // 서비스 음료수 개수
        int paidDrinks = k - freeDrinks;  // 실제 결제해야 하는 음료수 개수

        return (n * lambPrice) + (paidDrinks * drinkPrice);
    }
}