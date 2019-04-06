public class MyVisitor extends PascalGrammarBaseVisitor<Object> {

    @Override public Object visitProgram(PascalGrammarParser.ProgramContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitIdentifier(PascalGrammarParser.IdentifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitBlock(PascalGrammarParser.BlockContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUsesUnitsPart(PascalGrammarParser.UsesUnitsPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitLabelDeclarationPart(PascalGrammarParser.LabelDeclarationPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitLabel(PascalGrammarParser.LabelContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitConstantDefinitionPart(PascalGrammarParser.ConstantDefinitionPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitConstantDefinition(PascalGrammarParser.ConstantDefinitionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitConstantChr(PascalGrammarParser.ConstantChrContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitConstant(PascalGrammarParser.ConstantContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUnsignedNumber(PascalGrammarParser.UnsignedNumberContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSign(PascalGrammarParser.SignContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitBool(PascalGrammarParser.BoolContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitString(PascalGrammarParser.StringContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjectypeDefinitionPart(PascalGrammarParser.ObjectypeDefinitionPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjectypeDefinition(PascalGrammarParser.ObjectypeDefinitionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFunctionObjectype(PascalGrammarParser.FunctionObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitProcedureObjectype(PascalGrammarParser.ProcedureObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjectype(PascalGrammarParser.ObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSimpleObjectype(PascalGrammarParser.SimpleObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitScalarObjectype(PascalGrammarParser.ScalarObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSubrangeObjectype(PascalGrammarParser.SubrangeObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjectypeIdentifier(PascalGrammarParser.ObjectypeIdentifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStructuredObjectype(PascalGrammarParser.StructuredObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUnpackedStructuredObjectype(PascalGrammarParser.UnpackedStructuredObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStringtype(PascalGrammarParser.StringtypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitArrayObjectype(PascalGrammarParser.ArrayObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjectypeList(PascalGrammarParser.ObjectypeListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitIndexObjectype(PascalGrammarParser.IndexObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitComponentObjectype(PascalGrammarParser.ComponentObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitRecordObjectype(PascalGrammarParser.RecordObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFieldList(PascalGrammarParser.FieldListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFixedPart(PascalGrammarParser.FixedPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitRecordSection(PascalGrammarParser.RecordSectionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitVariantPart(PascalGrammarParser.VariantPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjectag(PascalGrammarParser.ObjectagContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitVariant(PascalGrammarParser.VariantContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSetObjectype(PascalGrammarParser.SetObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitBaseObjectype(PascalGrammarParser.BaseObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFileObjectype(PascalGrammarParser.FileObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPointerObjectype(PascalGrammarParser.PointerObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitParameterGroup(PascalGrammarParser.ParameterGroupContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitIdentifierList(PascalGrammarParser.IdentifierListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitConstList(PascalGrammarParser.ConstListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitResultObjectype(PascalGrammarParser.ResultObjectypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatement(PascalGrammarParser.StatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitVariable(PascalGrammarParser.VariableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitExpression(PascalGrammarParser.ExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitObjecterm(PascalGrammarParser.ObjectermContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSignedFactor(PascalGrammarParser.SignedFactorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFactor(PascalGrammarParser.FactorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitParameterList(PascalGrammarParser.ParameterListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSet(PascalGrammarParser.SetContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitElementList(PascalGrammarParser.ElementListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitElement(PascalGrammarParser.ElementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitActualParameter(PascalGrammarParser.ActualParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitParameterwidth(PascalGrammarParser.ParameterwidthContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitGotoStatement(PascalGrammarParser.GotoStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitEmpty(PascalGrammarParser.EmptyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatements(PascalGrammarParser.StatementsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitIfStatement(PascalGrammarParser.IfStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitCaseStatement(PascalGrammarParser.CaseStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitCaseListElement(PascalGrammarParser.CaseListElementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitWhileStatement(PascalGrammarParser.WhileStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitForStatement(PascalGrammarParser.ForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitForList(PascalGrammarParser.ForListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitInitialValue(PascalGrammarParser.InitialValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFinalValue(PascalGrammarParser.FinalValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitWithStatement(PascalGrammarParser.WithStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>Objecthe default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx) { return visitChildren(ctx); }
}
