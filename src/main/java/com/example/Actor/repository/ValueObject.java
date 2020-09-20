package com.example.Actor.repository;

/**
 * バリューオブジェクトを表すインターフェイス。
 *
 * <p>
 * バリューオブジェクトは原則的にImmutableであること。可変にせざるを得ない場合できる限り小さくすること。
 * このインターフェイスを実装するクラスでは、{@link Object#equals(Object)}は、
 * 属性のみでオブジェクトの等価判定を行うこと。
 * {@link Object#hashCode()}も一般契約に基づき実装すること。
 * </p>
 *
 * @param <T> バリューオブジェクトの型
 *
 * @author junichi
 */
public interface ValueObject<T extends ValueObject<T>> {

    /**
     * 指定されたバリューオブジェクトとこのバリューオブジェクトの等価を判定する。
     *
     * <p>{@link Object#equals}のタイプセーフ版</p>
     *
     * @param other バリューオブジェクト
     * @return 等価ならtrue
     */
    boolean sameValueAs(T other);

}
