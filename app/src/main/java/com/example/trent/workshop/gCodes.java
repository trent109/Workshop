package com.example.trent.workshop;
public class gCodes {
    String[] gCode= new String[54];
    String[] gMeaning= new String[54];

    String getCode;
    String getMeaning;

public gCodes(){
   //Populating the array
    // Two Arrays one to display the gCode Second is the meaning of the G code.
    gCode[0]="G00";     gMeaning[0]="RAPID POSITIONING MOTION";
    gCode[1]="G01";     gMeaning[1]="LINEAR INTERPOLATION MOTION";
    gCode[2]="G02";     gMeaning[2]="CIRCULAR INTERPOLATION MOTION CLOCKWISE";
    gCode[3]="G03";     gMeaning[3]=" CIRCULAR INTERPOLATION MOTION COUNTECLOCKWISE";
    gCode[4]="G04";     gMeaning[4]="DWELL";
    gCode[5]="G05";     gMeaning[5]="SPLINE DEFINITION";
    gCode[6]="G06";     gMeaning[6]="SPLINE INTERPOLATION";
    gCode[7]="G07";     gMeaning[7]="TANGENTIAL CIRCULAR INTERPOLATION / HELIX INTERPOLATION";
    gCode[8]="G08";     gMeaning[8]="RAMPING FUNCTION AT BLOCK TRANSITION ";
    gCode[9]="G09";     gMeaning[9]="EXACT STOP";
    gCode[10]="G10";    gMeaning[10]="PROGRAMMABLE OFFSET SETTING";
    gCode[11]="G11";    gMeaning[11]="STOP INTERPOLATION DURING BLOCK PROCESSION";
    gCode[12]="G12";    gMeaning[12]="CW CIRCULAR POCKET MILLING";
    gCode[13]="G13";    gMeaning[13]="CCW CIRCULAR POCKET MILLING";
    gCode[14]="G14";    gMeaning[14]="Polar coordinate programming, absolute ";
    gCode[15]="G15";    gMeaning[15]="Polar coordinate programming, relative";
    gCode[16]="G16";    gMeaning[16]="Definition of the pole point of the polar coordinate system";
    gCode[17]="G17";    gMeaning[17]="CIRCULAR MOTION XY PLANE SELECTION (G02 or G03)";
    gCode[18]="G18";    gMeaning[18]="CIRCULAR MOTION ZX PLANE SELECTION (G02 or G03)";
    gCode[19]="G19";    gMeaning[19]="CIRCULAR MOTION YZ PLANE SELECTION (G02 or G03)";
    gCode[20]="G20";    gMeaning[20]="VERIFY INCH COORDINATE POSITIONING (PROGRAMMING IN INCHES";
    gCode[21]="G21";    gMeaning[21]="VERIFY METRIC COORDINATE POSITIONING(PROGRAMMING IN MILLIMETERS";
    gCode[22]="G28";    gMeaning[22]="MACHINE ZERIO RETURN THRU REF. POINT";
    gCode[23]="G29";    gMeaning[23]="MOVE TO LOCATION THROUGH G28 REF. POINT ";
    gCode[24]="G31";    gMeaning[24]="FEED UNTIL SKIP FUNCTION";
    gCode[25]="G35";    gMeaning[25]="AUTOMATIC TOOL DIAMETER MEASUREMENT";
    gCode[26]="G36";    gMeaning[26]="AUTOMATIC WORK OFFSET MEASUREMENT";
    gCode[27]="G37";    gMeaning[27]="AUTOMATIC TOOL LENGTH MEASUREMENT";
    gCode[28]="G40";    gMeaning[28]="CUTTER COMPENSATION CANCEL G41/G42/G141";
    gCode[29]="G41";    gMeaning[29]="2D CUTTER COMPENSATION, LEFT (X, Y, D)";
    gCode[30]="G42";    gMeaning[30]="2D CUTTER COMPENSATION, RIGHT (X, Y, D)";
    gCode[31]="G43";    gMeaning[31]="TOOL LENGTH COMPESATION POSITIVE (H, Z)";
    gCode[32]="G44";    gMeaning[32]="TOOL LENGTH COMPENATION NEGATIVE(H, Z)";
    gCode[33]="G47";    gMeaning[33]="TEXT ENGRAVING (X, Y, Z, R, I, J,P, E, F)";
    gCode[34]="G49";    gMeaning[34]="TOOL LENGTH COMPENSATION CANCEL G43/G44/G143)";
    gCode[35]="G50";    gMeaning[35]="SCALING G51 CANCEL";
    gCode[36]="G51";    gMeaning[36]="SCALING (X, Y, Z, P)";
    gCode[37]="G52";    gMeaning[37]="WORK OFFSET COORDINATE POSITING";
    gCode[38]="G52";    gMeaning[38]="GLOBAL WORK COORDINATE OFFSET SHIFT";
    gCode[39]="G52";    gMeaning[39]="GLOBAL WORK COORDINATE OFFSET SHIFT";
    gCode[40]="G53";    gMeaning[40]="MACHINE COORDINATE POSITIONING, NON-MODAL (X, Y, Z, A, B)";
    gCode[41]="G54";    gMeaning[41]="WORK OFFSET COORDINATE POSITIONING #1";
    gCode[42]="G55";    gMeaning[42]="WORK OFFSET COORDINATE POSITIONING #2";
    gCode[43]="G56";    gMeaning[43]="WORK OFFSET COORDINATE POSITIONING #3";
    gCode[44]="G57";    gMeaning[44]=" WORK OFFSET COORDINATE POSITIONING #4";
    gCode[45]="G58";    gMeaning[45]="WORK OFFSET COORDINATE POSITIONING #5";
    gCode[46]="G59";    gMeaning[46]="WORK OfFSET COORDINATE POSITIONING #6";
    gCode[47]="G60";    gMeaning[47]="UNI-DIRECTIONAL POSITIONING (X, Y, Z, A, B)";
    gCode[48]="G61";    gMeaning[48]="EXACT STOP, MODAL (X, Y, Z, A, B)";
    gCode[49]="G64";    gMeaning[49]="EXACT STOP G61 MODE CANCEL";
    gCode[50]="G65";    gMeaning[50]="MACRO SUB-ROUTINE CALL";
    gCode[51]="G68";    gMeaning[51]="ROTATION (G17, G18, G19, X, Y, Z, R)";
    gCode[52]="G69";    gMeaning[52]="ROTATION G68 CANCEL";
    gCode[53]="G70";    gMeaning[53]="BOLT HOLE CIRCLE with a CANNED CYCLE (I, J, L)";
}
    //==================================setCode=========================================================
    public void setgCode(int index)
    {
        getCode=gCode[index];
    }
    //======================================getCode===================================================
    public String getCode()
    {
        return getCode;
    }
    //===================================setMeaning=================================================
    public void setgMeaning(int index){
        getMeaning = gMeaning[index];
    }
    //=================================getMeaning=======================================================
//Gets m code meaning with this method
    public String getMeaning()
    {
        return getMeaning;
    }

}
