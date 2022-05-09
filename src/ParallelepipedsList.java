
import java.util.ArrayList;
import java.util.List;
public class ParallelepipedsList {
    private final List<Parallelepiped> parallelepipedsList;

    public ParallelepipedsList() {
        parallelepipedsList = new ArrayList<Parallelepiped>();
    }

    public boolean add(Parallelepiped parallelepiped) {
        return parallelepipedsList.add(parallelepiped);
    }

    public ParallelepipedsList getCountOfCubes() {
        ParallelepipedsList count = new ParallelepipedsList();
        for (Parallelepiped parallelepiped : parallelepipedsList) {
            if ((parallelepiped.getParallelepipedHeight() == parallelepiped.getParallelepipedWidth()) &&
                    (parallelepiped.getParallelepipedWidth() == parallelepiped.getParallelepipedLength()))
                count.add(parallelepiped);
        }
        return count;
    }


    public Rectangle getParallelepipedFromList(int index) {
        return parallelepipedsList.get(index);
    }

    public List<Parallelepiped> getParallelepipedsList() {
        return parallelepipedsList;
    }

    @Override
    public String toString() {
        return "\nCount of cubes = " + getCountOfCubes().getParallelepipedsList().size();
    }
}
