package com.mindorks.framework.mvvm.data.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.mindorks.framework.mvvm.data.local.db.dao.OptionDao;
import com.mindorks.framework.mvvm.data.local.db.dao.QuestionDao;
import com.mindorks.framework.mvvm.data.local.db.dao.UserDao;
import com.mindorks.framework.mvvm.data.model.db.Option;
import com.mindorks.framework.mvvm.data.model.db.Question;
import com.mindorks.framework.mvvm.data.model.db.User;

/**
 * Created by amitshekhar on 07/07/17.
 */

@Database(entities = {User.class, Question.class, Option.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract OptionDao optionDao();

    public abstract QuestionDao questionDao();

    public abstract UserDao userDao();
}
