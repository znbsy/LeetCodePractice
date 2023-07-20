public class ReverseBits {
    public int reverseBits(int n) {
        n = ((0xAAAAAAAA & n) >>> 1) + ((0x55555555 & n) << 1);
        n = ((0x33333333 & n) << 2) + ((0xCCCCCCCC & n) >>> 2);
        n = ((0x0F0F0F0F & n) << 4) + ((0xF0F0F0F0 & n) >>> 4);
        n = ((0xFF00FF00 & n) >>> 8) + ((0x00FF00FF & n) << 8);
        n = ((0xFFFF0000 & n) >>> 16) + ((0x0000FFFF & n) << 16);

        return n;
    }
}
