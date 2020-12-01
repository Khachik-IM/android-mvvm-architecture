package com.mindorks.framework.mvvm.data.local.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.mindorks.framework.mvvm.data.model.db.Question;
import java.util.List;

import io.reactivex.Single;

/**
 * Created by amitshekhar on 08/07/17.
 */
@Dao
public interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Question question);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Question> questions);

    @Query("SELECT * FROM questions")
    Single<List<Question>> loadAll();
}
