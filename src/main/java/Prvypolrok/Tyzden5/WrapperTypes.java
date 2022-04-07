package Prvypolrok.Tyzden5;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperTypes {
    public static void main(String[] args) {
        // wrapper types - sluzi na to aby sa dali vyuzit primitivne datove typi ako objekty.

        //int
        int f = 5;
        Integer ff = new Integer(5);
        int[] neco = new int []{5,10,20};
        ArrayList<Integer> neco1 = new ArrayList<>();
        ArrayList<Integer> necoff = new ArrayList<>(Arrays.asList(5,10,20));
        //short
        short b = 5;
        Short bb = 55;
        short[] neco21 = new short[]{5,10,0};
        ArrayList<Short> neco12 = new ArrayList<>();
        ArrayList<Short> necoffff = new ArrayList<>(Arrays.asList((short)5,(short)10,(short)20));
        //byte
        byte c = 4;
        Byte cc = 44;
        byte[] neco22 = new byte[]{2,1,3};
        ArrayList<Byte> neco166 = new ArrayList<>();
        ArrayList<Byte> necofff = new ArrayList<>(Arrays.asList((byte)5,(byte)10,(byte)20));
        //long
        long d = 6;
        Long dd = 66L;
        long[] neco00 = new long[]{5,10,20};
        ArrayList<Long> necof1 = new ArrayList<>();
        ArrayList<Long> necoffddff = new ArrayList<>(Arrays.asList(5L,10L,20L));
        //float
        float e= 7;
        Float ee = 77F;
        float[] necooo = new float[]{6,6,6};
        ArrayList<Long> necofff1 = new ArrayList<>();
        ArrayList<Float> necofFAFAf = new ArrayList<>(Arrays.asList(5F,10F,20F));
        //Double
        double fd = 8;
        Double fdd = 88D;
        double[] necofafa = new double[]{55,55,5,5};
        ArrayList<Double> necfffo1 = new ArrayList<>();
        ArrayList<Double> necoasdff = new ArrayList<>(Arrays.asList(5D,10D,20D));
        //boolean
        boolean g = true;
        Boolean gh = false;
        boolean[] necoafaf = new boolean[]{true,false,false};
        ArrayList<Boolean> nefafaco1 = new ArrayList<>();
        ArrayList<Boolean> necoasffdff = new ArrayList<>(Arrays.asList(true,false,false));
        //charakter
        char h = 'f';
        Character hh = 'f';
        char[] fafaf = new char[]{'f','o'};
        ArrayList<Character> necofafa1 = new ArrayList<>();
        ArrayList<Character> necoasffdf55f = new ArrayList<>(Arrays.asList('f','c'));
        System.out.println(Arrays.toString(neco));
        System.out.println(Arrays.toString(fafaf));
        ArrayList<Boolean> necofFAFf55= new ArrayList<>(Arrays.asList(true,false,true));

        // Arrays to string , arrays sort .
    }
}
