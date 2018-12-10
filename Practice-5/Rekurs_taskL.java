public class Rekurs_taskL {
    public int Rekurs_task(int firstnum, int num)
    {
        for(int i = 1; i<=firstnum; i++)
        {
            System.out.println(firstnum);
        }
        if(firstnum != num) return Rekurs_task(firstnum+1, num);
        else return 0;
    }

}
