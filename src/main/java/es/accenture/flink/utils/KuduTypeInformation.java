package es.accenture.flink.utils;

import org.apache.flink.api.common.ExecutionConfig;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.common.typeutils.TypeSerializer;

/**
 * Created by vadi on 12/12/16.
 */
public class KuduTypeInformation extends TypeInformation{

    int arity;


    public KuduTypeInformation(RowSerializable r) {
        this.arity = r.getArity();

    }

    @Override
    public boolean isBasicType() {
        return false;
    }

    @Override
    public boolean isTupleType() {
        return false;
    }

    @Override
    public int getArity() {
        return this.getArity();
    }

    @Override
    public int getTotalFields() {
        return 0;
    }

    @Override
    public Class getTypeClass() {
        return null;
    }

    @Override
    public boolean isKeyType() {
        return false;
    }

    @Override
    public TypeSerializer createSerializer(ExecutionConfig executionConfig) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean canEqual(Object o) {
        return false;
    }
}