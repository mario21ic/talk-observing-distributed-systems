/*
 * This file is generated by jOOQ.
*/
package io.github.jeqo.demo.infra.jooq.tables;


import io.github.jeqo.demo.infra.jooq.Indexes;
import io.github.jeqo.demo.infra.jooq.Keys;
import io.github.jeqo.demo.infra.jooq.Public;
import io.github.jeqo.demo.infra.jooq.tables.records.TweetsRecord;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tweets extends TableImpl<TweetsRecord> {

    private static final long serialVersionUID = 1090847902;

    /**
     * The reference instance of <code>public.tweets</code>
     */
    public static final Tweets TWEETS = new Tweets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TweetsRecord> getRecordType() {
        return TweetsRecord.class;
    }

    /**
     * The column <code>public.tweets.id</code>.
     */
    public final TableField<TweetsRecord, BigInteger> ID = createField("id", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>public.tweets.created_at</code>.
     */
    public final TableField<TweetsRecord, String> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>public.tweets.user_id</code>.
     */
    public final TableField<TweetsRecord, BigInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20).nullable(false), this, "");

    /**
     * The column <code>public.tweets.text</code>.
     */
    public final TableField<TweetsRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>public.tweets.is_retweet</code>.
     */
    public final TableField<TweetsRecord, Boolean> IS_RETWEET = createField("is_retweet", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>public.tweets</code> table reference
     */
    public Tweets() {
        this(DSL.name("tweets"), null);
    }

    /**
     * Create an aliased <code>public.tweets</code> table reference
     */
    public Tweets(String alias) {
        this(DSL.name(alias), TWEETS);
    }

    /**
     * Create an aliased <code>public.tweets</code> table reference
     */
    public Tweets(Name alias) {
        this(alias, TWEETS);
    }

    private Tweets(Name alias, Table<TweetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tweets(Name alias, Table<TweetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TWEETS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TweetsRecord> getPrimaryKey() {
        return Keys.TWEETS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TweetsRecord>> getKeys() {
        return Arrays.<UniqueKey<TweetsRecord>>asList(Keys.TWEETS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TweetsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TweetsRecord, ?>>asList(Keys.TWEETS__TWEETS_USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tweets as(String alias) {
        return new Tweets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tweets as(Name alias) {
        return new Tweets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tweets rename(String name) {
        return new Tweets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tweets rename(Name name) {
        return new Tweets(name, null);
    }
}
