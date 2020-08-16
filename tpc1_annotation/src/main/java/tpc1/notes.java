package tpc1;

public class notes {
//	In case of Table Per Concrete class, tables are created per class. So there are no nullable values in the table.
//	Disadvantage of this approach is that duplicate columns are created in the subclass tables.
//
//	Here, we need to use @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) annotation in the parent class 
//	and @AttributeOverrides annotation in the subclasses.
//
//	@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) specifies that we are using table per concrete class strategy.
//	It should be specified in the parent class only.
//	@AttributeOverrides defines that parent class attributes will be overriden in this class. 
//	In table structure, parent class table columns will be added in the subclass table.
}
