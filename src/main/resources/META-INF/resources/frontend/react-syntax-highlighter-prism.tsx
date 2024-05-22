import {type ReactElement} from 'react';
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import * as styles from 'react-syntax-highlighter/dist/esm/styles/prism';
import {ReactAdapterElement, type RenderHooks} from "Frontend/generated/flow/ReactAdapter";
import React from 'react';

class SyntaxHighlighterPrismElement extends ReactAdapterElement {

    protected override render(hooks: RenderHooks): ReactElement | null {
      const [language] = hooks.useState<string>("language"); 
      const [content] =  hooks.useState<string>("content");
      const [style] = hooks.useState<string>("style");
      const [showLineNumbers] = hooks.useState<boolean>("showLineNumbers");
      const [wrapLongLines] = hooks.useState<boolean>("wrapLongLines");

      return <SyntaxHighlighter 
      			language={language} 
      			style={styles[style]}
      			showLineNumbers={showLineNumbers}
	            wrapLongLines={wrapLongLines}
	            customStyle={{
	              width: "calc(100% - 16px)",
	              height: "calc(100% - 20px)"
	            }}
      			>
      			{content}
      		</SyntaxHighlighter>;
    }
}
  
customElements.define("syntax-highlighter-prism",SyntaxHighlighterPrismElement);