package com.company.prac8;

import java.io.IOException;
import java.util.Collection;

public interface IWaitList<E> {
    public void add(E element) throws IOException;
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection<E> element);
    public boolean isEmpty();
}
