package com.github.zaileitv.osc.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.github.zaileitv.osc.cache.Cache;
import com.github.zaileitv.osc.cache.CacheDao;
import com.github.zaileitv.osc.cache.VodCollect;
import com.github.zaileitv.osc.cache.VodCollectDao;
import com.github.zaileitv.osc.cache.VodRecord;
import com.github.zaileitv.osc.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();
}
