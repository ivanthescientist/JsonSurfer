// Generated from JsonPath.g4 by ANTLR 4.9.3

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(JsonPathParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#syntaxMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaxMode(JsonPathParser.SyntaxModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePath(JsonPathParser.RelativePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#searchChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchChild(JsonPathParser.SearchChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#anyChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyChild(JsonPathParser.AnyChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(JsonPathParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(JsonPathParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(JsonPathParser.IndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(JsonPathParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#childNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildNode(JsonPathParser.ChildNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JsonPathParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#childrenNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenNode(JsonPathParser.ChildrenNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpr(JsonPathParser.FilterExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExist(JsonPathParser.FilterExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterGtNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterGtNum(JsonPathParser.FilterGtNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterGeNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterGeNum(JsonPathParser.FilterGeNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterLtNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterLtNum(JsonPathParser.FilterLtNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterLeNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterLeNum(JsonPathParser.FilterLeNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterEqualNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualNum(JsonPathParser.FilterEqualNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterNEqualNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNEqualNum(JsonPathParser.FilterNEqualNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterEqualBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualBool(JsonPathParser.FilterEqualBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterNEqualBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNEqualBool(JsonPathParser.FilterNEqualBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterEqualStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualStr(JsonPathParser.FilterEqualStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterNEqualStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNEqualStr(JsonPathParser.FilterNEqualStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterEqualNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualNull(JsonPathParser.FilterEqualNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterNEqualNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNEqualNull(JsonPathParser.FilterNEqualNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonPathParser#filterMatchRegex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterMatchRegex(JsonPathParser.FilterMatchRegexContext ctx);
}