# GridViewDemo
####xml文件
```java
<GridView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/main_gv_tuijian"
        android:numColumns="auto_fit"
        android:columnWidth="100dp"
        android:stretchMode="columnWidth"
        android:horizontalSpacing="@dimen/item_margin"
        android:verticalSpacing="@dimen/item_margin"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="@dimen/item_margin"/>
```
***
```java
  android:numColumns="auto_fit" //设置GridView的列数，这里可以设置数字1、2、3、...或者设置它自适应auto_fit
```
```java
  android:horizontalSpacing="@dimen/item_margin" //设置每个item之间左右的间距
  android:verticalSpacing="@dimen/item_margin" //设置每个item之间上下的间距
```
***
####java文件
```java
GridView gv_tuijian = (GridView) findViewById(R.id.main_gv_tuijian);
gv_tuijian.setAdapter(main_adapter);
```
***
```java
其中main_adapter和listview的adapter的没有什么区别
```
***
####效果图
![](https://github.com/dodola/PinterestLikeAdapterView/raw/master/01.png)

