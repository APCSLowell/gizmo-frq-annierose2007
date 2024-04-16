import java.util.ArrayList;
public class OnlinePurchaseManager{
  private ArrayList<Gizmo> purchases;
  public int countElectronicsByMaker(String maker){
    int count = 0;
    for (Gizmo gizmo : purchases) {
      if (gizmo.isElectronic() && gizmo.getMaker().equals(maker)) {
        count++;
      }
    }
    return count;
  }
  public boolean hasAdjacentEqualPair(){
    if (purchases.size() < 2) {
      return false;
    }
    for (int i = 0; i < purchases.size() - 1; i++) {
      Gizmo current = purchases.get(i);
      Gizmo next = purchases.get(i + 1);
      if (current.equals(next)) {
        return true;
      }
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
