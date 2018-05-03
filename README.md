# single-screen-quiz-app
<?xml version="1.0" encoding="utf-8"?>

<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/congrats"
    tools:context=".MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TextView
            android:id="@+id/goNow"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_margin="@dimen/sixteen"
            android:fontFamily="@string/fontFam1"
            android:text="@string/go"
            android:textAllCaps="true"
            android:textColor="@color/color1"
            android:textSize="@dimen/thirtySix1" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/goNow"
            android:orientation="vertical">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/twenty1"
                android:fontFamily="@string/fontFam2"
                android:text="@string/quest1"
                android:textColor="@color/color2"
                android:textSize="@dimen/twentyFour2" />

            <RadioGroup
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioButton
                    android:id="@+id/r1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam3"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFour3"
                    android:text="@string/tiger"
                    android:textColor="@color/color3"
                    android:textSize="@dimen/twentyFour4" />

                <RadioButton
                    android:id="@+id/r2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam4"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFour5"
                    android:text="@string/fox"
                    android:textColor="@color/color4"
                    android:textSize="@dimen/twentyFour6" />

                <RadioButton
                    android:id="@+id/r3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam5"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFour7"
                    android:text="@string/cheetah"
                    android:textColor="@color/color5"
                    android:textSize="@dimen/twentyFour8" />

                <RadioButton
                    android:id="@+id/r4"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam6"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/tentyFour"
                    android:text="@string/lion"
                    android:textColor="@color/color6"
                    android:textSize="@dimen/twentyFour9" />
            </RadioGroup>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/twenty5"
                android:fontFamily="@string/fontFam7"
                android:text="@string/quest2"
                android:textColor="@color/color7"
                android:textSize="@dimen/twentyFourSp" />

            <EditText
                android:id="@+id/ed"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/fifty"
                android:layout_marginRight="@dimen/thirtyDip"
                android:fontFamily="@string/fontFam8"
                android:hint="@string/type_here"
                android:inputType="number"
                android:textColor="@color/color8"
                android:textColorHint="@color/color9"
                android:textSize="@dimen/twentyFourSp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/twenty6"
                android:fontFamily="@string/fontFam9"
                android:text="@string/quest3"
                android:textColor="@color/color10"
                android:textSize="@dimen/twentyFourSp" />

            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:scaleX="0.75"
                android:scaleY="0.75"
                android:src="@drawable/img" />

            <RadioGroup
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioButton
                    android:id="@+id/rb1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip1"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam10"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFourDip"
                    android:text="@string/aristotle"
                    android:textColor="@color/color11"
                    android:textSize="@dimen/twentyFourSp" />

                <RadioButton
                    android:id="@+id/rb2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen6"
                    android:fontFamily="@string/fontFam11"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFourDip"
                    android:text="@string/albert_einstein"
                    android:textColor="@color/color12"
                    android:textSize="@dimen/twentyFourSp" />

                <RadioButton
                    android:id="@+id/rb3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam12"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFour8"
                    android:text="@string/sir_isaac_newton"
                    android:textColor="@color/color13"
                    android:textSize="@dimen/twentyFourSp" />

                <RadioButton
                    android:id="@+id/rb4"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="@dimen/thirtyFiveDip"
                    android:layout_marginTop="@dimen/sixteen"
                    android:fontFamily="@string/fontFam13"
                    android:onClick="onRadioButtonClicked"
                    android:paddingLeft="@dimen/twentyFourDip"
                    android:text="@string/alfred_nobel"
                    android:textColor="@color/color14"
                    android:textSize="@dimen/twentyFourSp" />
            </RadioGroup>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/twentyDip1"
                android:fontFamily="@string/fontFam14"
                android:text="@string/quest4"
                android:textColor="@color/color"
                android:textSize="@dimen/twentyFourSp" />

            <CheckBox
                android:id="@+id/cb1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/th5"
                android:layout_marginTop="@dimen/oneSix"
                android:fontFamily="@string/fontFam18"
                android:onClick="onCheckBoxClicked"
                android:paddingLeft="@dimen/twoFour"
                android:text="@string/larry_page"
                android:textColor="@color/color16"
                android:textSize="@dimen/twentyFourSp12" />

            <CheckBox
                android:id="@+id/cb2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/th35"
                android:layout_marginTop="@dimen/oneSix1"
                android:fontFamily="@string/fontFam16"
                android:onClick="onCheckBoxClicked"
                android:paddingLeft="@dimen/twoFour1"
                android:text="@string/bill_gates"
                android:textColor="@color/color17"
                android:textSize="@dimen/twentyFourSp11" />

            <CheckBox
                android:id="@+id/cb3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/th351"
                android:layout_marginTop="@dimen/sixteen16"
                android:fontFamily="@string/fontFam15"
                android:onClick="onCheckBoxClicked"
                android:paddingLeft="@dimen/twoFour4"
                android:text="@string/steve_jobs"
                android:textColor="@color/color0"
                android:textSize="@dimen/two41" />

            <CheckBox
                android:id="@+id/cb4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/three5Dp"
                android:layout_marginTop="@dimen/sixteen17"
                android:fontFamily="@string/fontFam17"
                android:onClick="onCheckBoxClicked"
                android:paddingLeft="@dimen/twoFour18"
                android:text="@string/sergey_brin"
                android:textColor="@color/color19"
                android:textSize="@dimen/twenty_four" />

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginBottom="@dimen/bottomTwenty"
                android:layout_marginTop="@dimen/twen_ty"
                android:onClick="calculateScore"
                android:text="@string/check_score" />
        </LinearLayout>
    </RelativeLayout>
</ScrollView>
