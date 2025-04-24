public class Lister_tab {
    int[]T;
    public void show (){
        if (T==null||T.length==0)
        throw new Tabvide();
        for(int i=0<;T.length;i++)
        System.out.println("tableau vide");
 
    }
    catch (Tabevide e){
    System.out.println("Tabevide");
}
}
public void showII() throws Tabevide {
    if (T==null||T.length==0) {
        throw new Tabevide();
        for (int i=0;i<T.length ;i++)
        System.out.println("tableau vide");
    }
    Lister_tab(int[]T){this.T=T;}
}