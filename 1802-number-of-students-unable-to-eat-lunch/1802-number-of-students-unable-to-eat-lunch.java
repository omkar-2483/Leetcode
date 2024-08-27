class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int student0=0;
        int student1=0;

        for(int std : students){
            if(std==0) student0++;
            else student1++;
        }

        for(int sandwich : sandwiches){
            if(sandwich==0 && student0==0) return student1;
            else if(sandwich==1 && student1==0) return student0;
            else if(sandwich==1) student1--;
            else student0--;
        }
        return 0;
    }
}