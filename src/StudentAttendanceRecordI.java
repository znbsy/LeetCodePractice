public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int firstA = s.indexOf("A");
        if(firstA != -1){
            int SecA = s.substring(firstA + 1).indexOf("A");
            if(SecA != -1){
                return false;
            }
        }
        int ThreeL = s.indexOf("LLL");
        return ThreeL == -1;
    }
}
