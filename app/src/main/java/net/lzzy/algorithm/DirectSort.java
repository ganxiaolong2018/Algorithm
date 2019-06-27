package net.lzzy.algorithm;

import android.net.wifi.aware.PublishConfig;

/**
 * Created by lzzy_gxy on 2019/6/13.
 * Description:
 */
public class DirectSort<T extends Comparable<? super T>>extends BaseSort<T> {
    DirectSort(T[] items) {
        super(items);
    }
    @Override
    public void sort(){
        for (int i = 0; i < items.length - 1; i++){
            int minPos = i;
            for (int j = i + 1; j < items.length; j++) {
                if (bigger(items[minPos],items[j])) {
                    minPos = j;

                }
            }
            swap(minPos, i);
        }
    }
}
