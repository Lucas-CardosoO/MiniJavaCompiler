package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.ast.And;
import br.ufpe.cin.if688.minijava.ast.ArrayAssign;
import br.ufpe.cin.if688.minijava.ast.ArrayLength;
import br.ufpe.cin.if688.minijava.ast.ArrayLookup;
import br.ufpe.cin.if688.minijava.ast.Assign;
import br.ufpe.cin.if688.minijava.ast.Block;
import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.Call;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.False;
import br.ufpe.cin.if688.minijava.ast.Formal;
import br.ufpe.cin.if688.minijava.ast.Identifier;
import br.ufpe.cin.if688.minijava.ast.IdentifierExp;
import br.ufpe.cin.if688.minijava.ast.IdentifierType;
import br.ufpe.cin.if688.minijava.ast.If;
import br.ufpe.cin.if688.minijava.ast.IntArrayType;
import br.ufpe.cin.if688.minijava.ast.IntegerLiteral;
import br.ufpe.cin.if688.minijava.ast.IntegerType;
import br.ufpe.cin.if688.minijava.ast.LessThan;
import br.ufpe.cin.if688.minijava.ast.MainClass;
import br.ufpe.cin.if688.minijava.ast.MethodDecl;
import br.ufpe.cin.if688.minijava.ast.Minus;
import br.ufpe.cin.if688.minijava.ast.NewArray;
import br.ufpe.cin.if688.minijava.ast.NewObject;
import br.ufpe.cin.if688.minijava.ast.Not;
import br.ufpe.cin.if688.minijava.ast.Plus;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.This;
import br.ufpe.cin.if688.minijava.ast.Times;
import br.ufpe.cin.if688.minijava.ast.True;
import br.ufpe.cin.if688.minijava.ast.Type;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.While;
import br.ufpe.cin.if688.minijava.exceptions.PrintException;
import br.ufpe.cin.if688.minijava.symboltable.Class;
import br.ufpe.cin.if688.minijava.symboltable.Method;
import br.ufpe.cin.if688.minijava.symboltable.SymbolTable;
import br.ufpe.cin.if688.minijava.symboltable.Variable;

import javax.lang.model.type.ArrayType;
import java.util.Enumeration;
import java.util.Vector;


public class TypeCheckVisitor implements IVisitor<Type> {

	private SymbolTable symbolTable;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	private Class currClass;
	private Method currMethod;

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		currClass = symbolTable.getClass(n.i1.s);
		currMethod = currClass.getMethod("main");

		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);

		currClass = null;
		currMethod = null;
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		currClass = symbolTable.getClass(n.i.s);

		n.i.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}

		currClass = null;
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		currClass = symbolTable.getClass(n.i.s);

		if (!(symbolTable.containsClass(n.j.s))) {
			PrintException.idNotFound(n.j.s);
		}

		n.i.accept(this);
		n.j.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}

		currClass = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);

		return n.t;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {

		currMethod = symbolTable.getMethod(n.i.s, currClass.getId());


		n.t.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		Type expType = n.e.accept(this);


		if (!symbolTable.compareTypes(n.t, expType)) {
			PrintException.typeMatch(n.t, expType);
		}
		currMethod = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		if (!symbolTable.containsClass(n.s)) {
			PrintException.idNotFound(n.s);
		}

		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		Type expType = n.e.accept(this);

		if(!(expType instanceof BooleanType)) {
			PrintException.typeMatch(new BooleanType(), expType);
		}

		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		Type expType = n.e.accept(this);

		if(!(expType instanceof BooleanType)) {
			PrintException.typeMatch(new BooleanType(), expType);
		}

		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type idType = symbolTable.getVarType(currMethod, currClass, n.i.s);
		n.i.accept(this);
		Type expType = n.e.accept(this);

		if (!symbolTable.compareTypes(idType, expType)) {
			PrintException.typeMatch(idType, expType);
		}

		return idType;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		n.i.accept(this);

		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if (!(symbolTable.getVarType(currMethod, currClass, n.i.s) instanceof IntArrayType)){
			PrintException.typeMatch(new IntArrayType(), symbolTable.getVarType(currMethod, currClass, n.i.s));
		}


		if(!(e1Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e1Type);
		}
		if (!(e2Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e2Type);
		}

		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if(!(e1Type instanceof BooleanType)) {
			PrintException.typeMatch(new BooleanType(), e1Type);
		}
		if (!(e2Type instanceof BooleanType)) {
			PrintException.typeMatch(new BooleanType(), e2Type);
		}

		return e1Type;
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if(!(e1Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e1Type);
		}
		if (!(e2Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e2Type);
		}

		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if(!(e1Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e1Type);
		}
		if (!(e2Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e2Type);
		}

		return e1Type;
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if(!(e1Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e1Type);
		}
		if (!(e2Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e2Type);
		}

		return e1Type;
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if(!(e1Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e1Type);
		}
		if (!(e2Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e2Type);
		}

		return e1Type;
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);

		if(!(e1Type instanceof IntArrayType)) {
			PrintException.typeMatch(new IntArrayType(), e1Type);
		}
		if (!(e2Type instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), e2Type);
		}

		return e2Type;
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		Type arrayType = n.e.accept(this);

		if (!(arrayType instanceof IntArrayType)) {
			PrintException.typeMatch(new IntArrayType(), arrayType);
		}

		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		n.e.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
		return null;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return symbolTable.getVarType(currMethod, currClass, n.s);
	}

	public Type visit(This n) {
		return currClass.type();
	}

	// Exp e;
	public Type visit(NewArray n) {
		Type expType = n.e.accept(this);

		if (!(expType instanceof IntegerType)) {
			PrintException.typeMatch(new IntegerType(), expType);
		}

		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {
		if(!(symbolTable.containsClass(n.i.s))) {
			PrintException.idNotFound(n.i.s);
		}

		return new IdentifierType(n.i.s);
	}

	// Exp e;
	public Type visit(Not n) {
		Type expType = n.e.accept(this);
		if (!(expType instanceof BooleanType)) {
			PrintException.typeMatch(new BooleanType(), expType);
		}
		return expType;
	}

	// String s;
	public Type visit(Identifier n) {
		return null;
	}
}
