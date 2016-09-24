package com.example.trent.workshop;

/**
 * Created by Trent on 8/25/2016.
 * set this class up and made the codes and meaning their own array in case later on in my
 * development of this app if i wanted to use the codes else where.
 */
public class mCodes {
    //Initiating arrays
    String[] mCode= new String[29];
    String[] mMeaning= new String[29];
    //Variables for get methods
    String getCode;
    String getMeaning;
    //===============================main method========================================================
    public mCodes(){
        mCode[0]="M00";     mMeaning[0]=" PROGRAM STOP";
        mCode[1]="M01";     mMeaning[1]=" OPTIONAL PROGRAM STOP";
        mCode[2]="M02";     mMeaning[2]=" PROGRAM END";
        mCode[3]="M03";     mMeaning[3]=" SPINDLE ON CLOCKWISE";
        mCode[4]="M04";     mMeaning[4]=" SPINDLE ON COUTERCLOCKWISE";
        mCode[5]="M05";     mMeaning[5]=" SPINDLE STOP";
        mCode[6]="M06";     mMeaning[6]=" TOOL CHANGE";
        mCode[7]="M08";     mMeaning[7]=" COOLANT ON";
        mCode[8]="M09";     mMeaning[8]=" COOLANT OFF";
        mCode[9]="M19";     mMeaning[9]=" ORIENT SPINDLE (P, R)";
        mCode[10]="M21";    mMeaning[10]=" OPTIONAL USER M CODE";
        mCode[11]="M22";    mMeaning[11]=" OPTIONAL USER M CODE";
        mCode[12]="M23";    mMeaning[12]=" OPTIONAL USER M CODE";
        mCode[13]="M24";    mMeaning[13]=" OPTIONAL USER M CODE";
        mCode[14]="M25";    mMeaning[14]=" OPTIONAL USER M CODE";
        mCode[15]="M26";    mMeaning[15]=" OPTIONAL USER M CODE";
        mCode[16]="M27";    mMeaning[16]=" OPTIONAL USER M CODE";
        mCode[17]="M28";    mMeaning[17]=" OPTIONAL USER M CODE";
        mCode[18]="M30";    mMeaning[18]=" PROGRAM END AND RESET";
        mCode[19]="M31";    mMeaning[19]=" CHIP AUGER FORWARD";
        mCode[20]="M32";    mMeaning[20]=" CHIP AUGER REVERSE";
        mCode[21]="M33";    mMeaning[21]=" CHIP AUGER STOP";
        mCode[22]="M34";    mMeaning[22]=" COOLANT SPIGOT POSITION DOWN, INCREMENT";
        mCode[23]="M35";    mMeaning[23]=" COOLANT SPIGOT POSITION UP, DECREMENT";
        mCode[24]="M36";    mMeaning[24]=" PALLET PART READY";
        mCode[25]="M39";    mMeaning[25]=" ROTATE TOOL TURRET";
        mCode[26]="M41";    mMeaning[26]=" SPINDLE LOW GEAR OVERRIDE";
        mCode[27]="M42";    mMeaning[27]=" SPINDLE HIGH GEAR OVERRIDE";
        mCode[28]="M50";    mMeaning[28]=" EXECUTE PALLET CHANGE";
    }
    //==================================setCode=========================================================
    public void setmCode(int index)
    {
        getCode=mCode[index];
    }
    //======================================getCode===================================================
    public String getCode()
    {
        return getCode;
    }
    //===================================setMeaning=================================================
    public void setmMeaning(int index){
        getMeaning = mMeaning[index];
    }
    //=================================getMeaning=======================================================
//Gets m code meaning with this method
    public String getMeaning()
    {
        return getMeaning;
    }
}
