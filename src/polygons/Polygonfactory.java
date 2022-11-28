public class Polygonfactory(){

/*
private Polygon newPolygon;
private int x; 
private int y; 
*/
private List<Polygon> polygonList = new ArrayList<>(10);
private Polygon polygon;


public Polygonfactory(Polygon newPolygon, int x, int y){

polygon = new newPolygon(x,y);
polygonList.add(polygon);

}

public Polygon getListOfPolygons(){

    return polygonList;
}


/*
}
public Square createSquare (){


}

public Rectangle createRectangle(){


}

public Triangle createTriangle(){


}
*/



}



