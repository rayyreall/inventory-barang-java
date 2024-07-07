package models;

import errors.InvalidQuantityException;

public abstract class ItemImplements {
    public abstract ItemModel inputItem () throws InvalidQuantityException;
    public abstract String getCategory ();
}
