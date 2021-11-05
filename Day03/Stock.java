package Day03;

import java.util.List;

public class Stock {

    private List<Double> stockList;
    private double rate = 0.0;

    public Stock(List<Double> stockList) {
        this.stockList = stockList;
    }

    public double maxProfit() {
        for (int i = 0; i < this.stockList.size(); i++){
            for(int j = i + 1; j < this.stockList.size(); j++)
                if(this.stockList.get(j) - this.stockList.get(i) > rate){
                    rate = this.stockList.get(j) - this.stockList.get(i);
            }
        }
        return rate;
    }
}
