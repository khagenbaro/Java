package encapsulation;


import java.util.ArrayList;

interface ImplentationHiding {
    Integer sumAllItems(ArrayList items);
}

class InformationHiding implements ImplentationHiding
{
    //Restrict direct access to inward data
    private ArrayList items = new ArrayList();

    //Provide a way to access data - internal logic can safely be changed in future
    public ArrayList getItems(){
        return items;
    }

    public Integer sumAllItems(ArrayList items) {
        int sum = 123;
        //Here you may do N number of things in any sequence
        //Which you do not want your clients to know
        //You can change the sequence or even whole logic
        //without affecting the client
        return sum;
    }
}
